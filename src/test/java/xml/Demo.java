package xml;

public class Demo {

	public static void main(String[] args) {
		
		String xmlFilePath = System.getProperty("user.dir")+".\\src\\test\\java\\xml\\xmlFile.xml";
		
		//XMLReader xmlReader = new XMLReader(xmlFilePath);
		
		//List<Hashtable<String, String>> listTable = xmlReader.getDataAsList("employeeData");
		
		//int listSize = listTable.size();
		
		//for(int i=0; i<listSize; i++) {
			
			//Hashtable<String, String> table = listTable.get(i);
			
			//System.out.println("name = "+table.get("name"));
			//System.out.println("experience = "+table.get("experience"));
			//System.out.println("age = "+table.get("age"));
			//System.out.println("--------------------------");
			
		}
		
		/* DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		 * Document xmlDocument = docBuilder.parse(xmlFile);
		 * Element rootElement = xmlDocument.getDocumentElement();
		 * String rootElementNodeName = rootElement.getNodeName();
		 * short nodeType = rootElement.getNodeType();
		 * System.out.println(Node.DOCUMENT_NODE); //9
		 * System.out.println(Node.ELEMENT_NODE); //1
		 * System.out.println(Node.TEXT_NODE); //3
		 * System.out.println(Node.ATTRIBUTE_NODE); //2
		 * System.out.println(Node.COMMENT_NODE); //8
		 * if(nodeType==Node.ELEMENT_NODE) {
			System.out.println("Root element is a Node");
			NodeList nodeList = rootElement.getChildNodes();
		    int x = nodeList.getLength();
		    System.out.println(x);
			
		}
		 */
		
		
	}
