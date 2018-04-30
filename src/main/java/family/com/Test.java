package family.com;

public class Test {

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.displayLinkedList();
		
		singlyLinkedList.addFirstElement(10);
		singlyLinkedList.displayLinkedList();
		
		singlyLinkedList.addFirstElement(20);
		singlyLinkedList.displayLinkedList();
		
		singlyLinkedList.addLastElement(100);
		singlyLinkedList.displayLinkedList();
		
		try {
			singlyLinkedList.addElementAtPosition(10, 15);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			singlyLinkedList.addElementAtPosition(2, 20);
			singlyLinkedList.displayLinkedList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		singlyLinkedList.removeAllElementWithTargetValue(20);
		singlyLinkedList.displayLinkedList();
		
	}
}
