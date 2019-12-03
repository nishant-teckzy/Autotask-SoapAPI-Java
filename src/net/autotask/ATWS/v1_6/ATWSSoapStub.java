/**
 * ATWSSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ATWSSoapStub extends org.apache.axis.client.Stub implements
		net.autotask.ATWS.v1_6.ATWSSoap {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[14];
		_initOperationDesc1();
		_initOperationDesc2();
	}
	
	

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("GetAttachment");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"attachmentId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "long"),
				long.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "Attachment"));
		oper.setReturnClass(net.autotask.ATWS.v1_6.Attachment.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "GetAttachmentResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("CreateAttachment");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"attachment"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"Attachment"), net.autotask.ATWS.v1_6.Attachment.class,
				false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		oper.setReturnClass(long.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "CreateAttachmentResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DeleteAttachment");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"attachmentId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "long"),
				long.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "DeleteAttachmentResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getEntityInfo");
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "ArrayOfEntityInfo"));
		oper.setReturnClass(net.autotask.ATWS.v1_6.EntityInfo[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "GetEntityInfoResult"));
		param = oper.getReturnParamDesc();
		param.setItemQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "EntityInfo"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("GetFieldInfo");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"psObjectType"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "ArrayOfField"));
		oper.setReturnClass(net.autotask.ATWS.v1_6.Field[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "GetFieldInfoResult"));
		param = oper.getReturnParamDesc();
		param.setItemQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "Field"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getUDFInfo");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"psTable"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "ArrayOfField"));
		oper.setReturnClass(net.autotask.ATWS.v1_6.Field[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "getUDFInfoResult"));
		param = oper.getReturnParamDesc();
		param.setItemQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "Field"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("query");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"sXML"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "ATWSResponse"));
		oper.setReturnClass(net.autotask.ATWS.v1_6.ATWSResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "queryResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("create");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"Entities"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"ArrayOfEntity"),
				net.autotask.ATWS.v1_6.Entity[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "Entity"));
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "ATWSResponse"));
		oper.setReturnClass(net.autotask.ATWS.v1_6.ATWSResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "createResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("update");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"Entities"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"ArrayOfEntity"),
				net.autotask.ATWS.v1_6.Entity[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "Entity"));
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "ATWSResponse"));
		oper.setReturnClass(net.autotask.ATWS.v1_6.ATWSResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "updateResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("delete");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"Entities"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"ArrayOfEntity"),
				net.autotask.ATWS.v1_6.Entity[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "Entity"));
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "ATWSResponse"));
		oper.setReturnClass(net.autotask.ATWS.v1_6.ATWSResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "deleteResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[9] = oper;

	}

	private static void _initOperationDesc2() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getZoneInfo");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"UserName"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "ATWSZoneInfo"));
		oper.setReturnClass(net.autotask.ATWS.v1_6.ATWSZoneInfo.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "getZoneInfoResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[10] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getThresholdAndUsageInfo");
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "ATWSResponse"));
		oper.setReturnClass(net.autotask.ATWS.v1_6.ATWSResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/",
				"getThresholdAndUsageInfoResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[11] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("GetWsdlVersion");
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "GetWsdlVersionResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[12] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("GetInvoiceMarkup");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"InvoiceId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
						"Format"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "GetInvoiceMarkupResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[13] = oper;

	}
	
	

//	public ATWSSoapStub() throws org.apache.axis.AxisFault {
//		this(null);
//	}

	public ATWSSoapStub() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ATWSSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service)
			throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public ATWSSoapStub(javax.xml.rpc.Service service)
			throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service)
				.setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		addBindings0();
		addBindings1();
	}

	private void addBindings0() {
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">create");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Create.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">CreateAttachment");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.CreateAttachment.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">CreateAttachmentResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.CreateAttachmentResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">createResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.CreateResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">delete");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Delete.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">DeleteAttachment");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.DeleteAttachment.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">DeleteAttachmentResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.DeleteAttachmentResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">deleteResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.DeleteResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">GetAttachment");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetAttachment.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">GetAttachmentResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetAttachmentResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">GetEntityInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetEntityInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">GetEntityInfoResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetEntityInfoResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">GetFieldInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetFieldInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">GetFieldInfoResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetFieldInfoResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">GetInvoiceMarkup");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetInvoiceMarkup.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">GetInvoiceMarkupResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetInvoiceMarkupResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">getThresholdAndUsageInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetThresholdAndUsageInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">getThresholdAndUsageInfoResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetThresholdAndUsageInfoResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">getUDFInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetUDFInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">getUDFInfoResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetUDFInfoResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">GetWsdlVersion");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetWsdlVersion.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">GetWsdlVersionResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetWsdlVersionResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">getZoneInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetZoneInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">getZoneInfoResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.GetZoneInfoResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">query");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Query.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">queryResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.QueryResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">update");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Update.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				">updateResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.UpdateResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Account");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Account.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"AccountAlert");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.AccountAlert.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"AccountLocation");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.AccountLocation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"AccountNote");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.AccountNote.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"AccountPhysicalLocation");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.AccountPhysicalLocation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"AccountTeam");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.AccountTeam.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"AccountToDo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.AccountToDo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ActionType");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ActionType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"AdditionalInvoiceFieldValue");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.AdditionalInvoiceFieldValue.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"AllocationCode");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.AllocationCode.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Appointment");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Appointment.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ArrayOfATWSError");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ATWSError[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ATWSError");
		qName2 = new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "ATWSError");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ArrayOfEntity");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Entity[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Entity");
		qName2 = new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "Entity");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ArrayOfEntityInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.EntityInfo[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"EntityInfo");
		qName2 = new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "EntityInfo");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ArrayOfEntityReturnInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.EntityReturnInfo[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"EntityReturnInfo");
		qName2 = new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "EntityReturnInfo");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ArrayOfField");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Field[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Field");
		qName2 = new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "Field");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ArrayOfPickListValue");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PickListValue[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PickListValue");
		qName2 = new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "PickListValue");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ArrayOfUserDefinedField");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.UserDefinedField[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"UserDefinedField");
		qName2 = new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "UserDefinedField");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Attachment");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Attachment.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"AttachmentInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.AttachmentInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ATWSError");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ATWSError.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ATWSResponse");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ATWSResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ATWSZoneInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ATWSZoneInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"AutotaskIntegrations");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.AutotaskIntegrations.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"BillingItem");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.BillingItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"BillingItemApprovalLevel");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.BillingItemApprovalLevel.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"BusinessDivision");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.BusinessDivision.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"BusinessDivisionSubdivision");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.BusinessDivisionSubdivision.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"BusinessDivisionSubdivisionResource");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.BusinessDivisionSubdivisionResource.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"BusinessLocation");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.BusinessLocation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"BusinessSubdivision");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.BusinessSubdivision.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ChangeRequestLink");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ChangeRequestLink.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ChecklistLibrary");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ChecklistLibrary.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ChecklistLibraryChecklistItem");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ChecklistLibraryChecklistItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ClassificationIcon");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ClassificationIcon.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ClientPortalUser");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ClientPortalUser.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Contact");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Contact.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContactBillingProductAssociation");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContactBillingProductAssociation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContactGroup");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContactGroup.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContactGroupContact");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContactGroupContact.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Contract");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Contract.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractBillingRule");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractBillingRule.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractBlock");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractBlock.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractCost");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractCost.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractExclusionAllocationCode");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractExclusionAllocationCode.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractExclusionRole");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractExclusionRole.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractExclusionSet");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractExclusionSet.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractExclusionSetExcludedRole");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractExclusionSetExcludedRole.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractExclusionSetExcludedWorkType");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractExclusionSetExcludedWorkType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractFactor");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractFactor.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractMilestone");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractMilestone.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractNote");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractNote.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractRate");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractRate.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractRetainer");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractRetainer.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractRoleCost");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractRoleCost.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractService");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractService.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractServiceAdjustment");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractServiceAdjustment.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractServiceBundle");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractServiceBundle.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractServiceBundleAdjustment");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractServiceBundleAdjustment.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractServiceBundleUnit");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractServiceBundleUnit.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractServiceUnit");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractServiceUnit.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ContractTicketPurchase");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ContractTicketPurchase.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Country");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Country.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Currency");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Currency.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Department");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Department.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Entity");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Entity.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"EntityDuplicateStatus");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.EntityDuplicateStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"EntityInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.EntityInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"EntityReturnInfo");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.EntityReturnInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"EntityReturnInfoDatabaseAction");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.EntityReturnInfoDatabaseAction.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ExpenseItem");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ExpenseItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ExpenseReport");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ExpenseReport.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	private void addBindings1() {
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Field");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Field.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Holiday");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Holiday.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"HolidaySet");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.HolidaySet.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"InstalledProduct");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.InstalledProduct.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"InstalledProductBillingProductAssociation");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.InstalledProductBillingProductAssociation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"InstalledProductType");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.InstalledProductType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"InstalledProductTypeUdfAssociation");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.InstalledProductTypeUdfAssociation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"InternalLocation");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.InternalLocation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"InventoryItem");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.InventoryItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"InventoryItemSerialNumber");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.InventoryItemSerialNumber.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"InventoryLocation");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.InventoryLocation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"InventoryTransfer");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.InventoryTransfer.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Invoice");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Invoice.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"InvoiceTemplate");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.InvoiceTemplate.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"NotificationHistory");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.NotificationHistory.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Opportunity");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Opportunity.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PaymentTerm");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PaymentTerm.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Phase");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Phase.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PickListValue");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PickListValue.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PriceListMaterialCode");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PriceListMaterialCode.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PriceListProduct");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PriceListProduct.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PriceListProductTier");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PriceListProductTier.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PriceListRole");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PriceListRole.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PriceListService");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PriceListService.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PriceListServiceBundle");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PriceListServiceBundle.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PriceListWorkTypeModifier");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PriceListWorkTypeModifier.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Product");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Product.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ProductTier");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ProductTier.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ProductVendor");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ProductVendor.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Project");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Project.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ProjectCost");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ProjectCost.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ProjectNote");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ProjectNote.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PurchaseApproval");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PurchaseApproval.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PurchaseOrder");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PurchaseOrder.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PurchaseOrderItem");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PurchaseOrderItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"PurchaseOrderReceive");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.PurchaseOrderReceive.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Quote");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Quote.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"QuoteItem");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.QuoteItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"QuoteLocation");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.QuoteLocation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"QuoteTemplate");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.QuoteTemplate.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Resource");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Resource.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ResourceRole");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ResourceRole.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ResourceRoleDepartment");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ResourceRoleDepartment.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ResourceRoleQueue");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ResourceRoleQueue.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ResourceServiceDeskRole");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ResourceServiceDeskRole.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ResourceSkill");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ResourceSkill.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Role");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Role.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"SalesOrder");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.SalesOrder.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Service");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Service.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ServiceBundle");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ServiceBundle.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ServiceBundleService");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ServiceBundleService.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ServiceCall");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ServiceCall.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ServiceCallTask");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ServiceCallTask.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ServiceCallTaskResource");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ServiceCallTaskResource.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ServiceCallTicket");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ServiceCallTicket.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ServiceCallTicketResource");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ServiceCallTicketResource.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ServiceLevelAgreementResults");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ServiceLevelAgreementResults.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"ShippingType");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.ShippingType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Skill");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Skill.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Subscription");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Subscription.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"SubscriptionPeriod");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.SubscriptionPeriod.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Survey");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Survey.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"SurveyResults");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.SurveyResults.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Task");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Task.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TaskNote");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TaskNote.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TaskPredecessor");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TaskPredecessor.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TaskSecondaryResource");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TaskSecondaryResource.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Tax");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Tax.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TaxCategory");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TaxCategory.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TaxRegion");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TaxRegion.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"Ticket");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.Ticket.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketAdditionalContact");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketAdditionalContact.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketAdditionalInstalledProduct");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketAdditionalInstalledProduct.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketCategory");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketCategory.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketCategoryFieldDefaults");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketCategoryFieldDefaults.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketChangeRequestApproval");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketChangeRequestApproval.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketChecklistItem");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketChecklistItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketChecklistLibrary");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketChecklistLibrary.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketCost");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketCost.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketHistory");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketHistory.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketNote");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketNote.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TicketSecondaryResource");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TicketSecondaryResource.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"TimeEntry");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.TimeEntry.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"UserDefinedField");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.UserDefinedField.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"UserDefinedFieldDefinition");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.UserDefinedFieldDefinition.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"UserDefinedFieldListItem");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.UserDefinedFieldListItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/",
				"WorkTypeModifier");
		cachedSerQNames.add(qName);
		cls = net.autotask.ATWS.v1_6.WorkTypeModifier.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	protected org.apache.axis.client.Call createCall()
			throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses
								.get(i);
						javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames
								.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class) cachedSerFactories
									.get(i);
							java.lang.Class df = (java.lang.Class) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
									.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		} catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault(
					"Failure trying to get the Call object", _t);
		}
	}

	public net.autotask.ATWS.v1_6.Attachment getAttachment(long attachmentId)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/GetAttachment");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "GetAttachment"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { new java.lang.Long(
							attachmentId) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (net.autotask.ATWS.v1_6.Attachment) _resp;
				} catch (java.lang.Exception _exception) {
					return (net.autotask.ATWS.v1_6.Attachment) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									net.autotask.ATWS.v1_6.Attachment.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public long createAttachment(net.autotask.ATWS.v1_6.Attachment attachment)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/CreateAttachment");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "CreateAttachment"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { attachment });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return ((java.lang.Long) _resp).longValue();
				} catch (java.lang.Exception _exception) {
					return ((java.lang.Long) org.apache.axis.utils.JavaUtils
							.convert(_resp, long.class)).longValue();
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public java.lang.String deleteAttachment(long attachmentId)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/DeleteAttachment");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "DeleteAttachment"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { new java.lang.Long(
							attachmentId) });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public net.autotask.ATWS.v1_6.EntityInfo[] getEntityInfo()
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/GetEntityInfo");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "GetEntityInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (net.autotask.ATWS.v1_6.EntityInfo[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (net.autotask.ATWS.v1_6.EntityInfo[]) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									net.autotask.ATWS.v1_6.EntityInfo[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public net.autotask.ATWS.v1_6.Field[] getFieldInfo(
			java.lang.String psObjectType) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/GetFieldInfo");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "GetFieldInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { psObjectType });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (net.autotask.ATWS.v1_6.Field[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (net.autotask.ATWS.v1_6.Field[]) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									net.autotask.ATWS.v1_6.Field[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public net.autotask.ATWS.v1_6.Field[] getUDFInfo(java.lang.String psTable)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/getUDFInfo");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "getUDFInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { psTable });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (net.autotask.ATWS.v1_6.Field[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (net.autotask.ATWS.v1_6.Field[]) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									net.autotask.ATWS.v1_6.Field[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public net.autotask.ATWS.v1_6.ATWSResponse query(java.lang.String sXML)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/query");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "query"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { sXML });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (net.autotask.ATWS.v1_6.ATWSResponse) _resp;
				} catch (java.lang.Exception _exception) {
					return (net.autotask.ATWS.v1_6.ATWSResponse) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									net.autotask.ATWS.v1_6.ATWSResponse.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public net.autotask.ATWS.v1_6.ATWSResponse create(Entity[] entities)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/create");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "create"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
//			System.out.println(_call.invoke(new java.lang.Object[] { entities }));
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { entities });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (net.autotask.ATWS.v1_6.ATWSResponse) _resp;
				} catch (java.lang.Exception _exception) {
					return (net.autotask.ATWS.v1_6.ATWSResponse) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									net.autotask.ATWS.v1_6.ATWSResponse.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public net.autotask.ATWS.v1_6.ATWSResponse update(
			net.autotask.ATWS.v1_6.Entity[] entities)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/update");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "update"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { entities });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (net.autotask.ATWS.v1_6.ATWSResponse) _resp;
				} catch (java.lang.Exception _exception) {
					return (net.autotask.ATWS.v1_6.ATWSResponse) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									net.autotask.ATWS.v1_6.ATWSResponse.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public net.autotask.ATWS.v1_6.ATWSResponse delete(
			net.autotask.ATWS.v1_6.Entity[] entities)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/delete");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "delete"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { entities });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (net.autotask.ATWS.v1_6.ATWSResponse) _resp;
				} catch (java.lang.Exception _exception) {
					return (net.autotask.ATWS.v1_6.ATWSResponse) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									net.autotask.ATWS.v1_6.ATWSResponse.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public net.autotask.ATWS.v1_6.ATWSZoneInfo getZoneInfo(
			java.lang.String userName) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/getZoneInfo");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "getZoneInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { userName });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (net.autotask.ATWS.v1_6.ATWSZoneInfo) _resp;
				} catch (java.lang.Exception _exception) {
					return (net.autotask.ATWS.v1_6.ATWSZoneInfo) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									net.autotask.ATWS.v1_6.ATWSZoneInfo.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public net.autotask.ATWS.v1_6.ATWSResponse getThresholdAndUsageInfo()
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/getThresholdAndUsageInfo");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "getThresholdAndUsageInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (net.autotask.ATWS.v1_6.ATWSResponse) _resp;
				} catch (java.lang.Exception _exception) {
					return (net.autotask.ATWS.v1_6.ATWSResponse) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									net.autotask.ATWS.v1_6.ATWSResponse.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public java.lang.String getWsdlVersion() throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/GetWsdlVersion");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "GetWsdlVersion"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public java.lang.String getInvoiceMarkup(int invoiceId,
			java.lang.String format) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[13]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://autotask.net/ATWS/v1_6/GetInvoiceMarkup");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://autotask.net/ATWS/v1_6/", "GetInvoiceMarkup"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					new java.lang.Integer(invoiceId), format });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
