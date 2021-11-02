package Zadaca03;

public class XMLCreatorUsersGlavna {

	public static void main(String[] args) {
		Users user=new Users("user1", "user@mail.com", "2012");
		System.out.println(XMLCreator1.createXMLDoc(user));

	}

}
