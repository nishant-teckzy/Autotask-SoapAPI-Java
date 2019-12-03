package util;

import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * Contains Methods Specifically for API's Query Request XML Creation
 * @author Nishant Tiwari
 * @created at 06-Nov-2019
 * 
 */
public class QueryXml {
	private static final Logger log = Logger.getLogger(QueryXml.class);
	private DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	private DocumentBuilder docBuilder = null;
	private Document querydoc = null;
	

	
	public QueryXml() {
		super();
		try {
			docBuilder = docFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Impements the creation of CData XML section for Query
	 *@author Nishant Tiwari
	 * @created at 06-Nov-2019
	 * 
	 * @param entityType
	 * 		:Type of Entity to be Queried
	 * @param searchKey
	 * 		:The key to perform the query
	 * @param searchTerm
	 * 		:The Term to perform the search on
	 * @param operation
	 * 		:Operation of Search
	 * @return Document
	 */
	public String createCData(String entityType,String searchKey,String searchTerm,String operation){
	
		String xmlStr = "";
			//queryxml Node
			querydoc = docBuilder.newDocument();
			Element queryxml = querydoc.createElement("queryxml");
			querydoc.appendChild(queryxml);
			
			//entity Node
			Element entity = querydoc.createElement("entity");
			entity.setTextContent(entityType);
			
			//query Node
			Element query = querydoc.createElement("query");
			
			//condition Node
			Element condition = querydoc.createElement("condition");
			query.appendChild(condition);
			
			//field Node
			Element field = querydoc.createElement("field");
			field.setTextContent(searchKey);
			
			//expression Node
			Element expression = querydoc.createElement("expression");
			expression.setAttribute("op", operation);
			expression.setTextContent(searchTerm);
			//Appending all Elements
			
			queryxml.appendChild(entity);
			queryxml.appendChild(query);
			field.appendChild(expression);
			condition.appendChild(field);
			
			try {
				xmlStr = xmlToString(querydoc);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error(e.getMessage());
			}
		return xmlStr;
		
	}

	
	private static final String xmlToString(Document xml) throws Exception {
        Transformer tf = TransformerFactory.newInstance().newTransformer();
        tf.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        Writer out = new StringWriter();
        tf.transform(new DOMSource(xml), new StreamResult(out));
        return out.toString();

    }
}
