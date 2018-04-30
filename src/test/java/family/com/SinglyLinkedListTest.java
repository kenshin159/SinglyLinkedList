package family.com;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {

	@Test
	public void testAddFirstElement() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addFirstElement(10);
		Assert.assertEquals(singlyLinkedList.getSize(), 1);
		Assert.assertEquals(singlyLinkedList.getHead().getData(), 10);
		Assert.assertEquals(singlyLinkedList.getHead(),
				singlyLinkedList.getTail());
		Assert.assertNull(singlyLinkedList.getHead().getNext());

	}

	@Test
	public void testAddLastElement() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addFirstElement(10);
		singlyLinkedList.addLastElement(20);
		Assert.assertEquals(singlyLinkedList.getSize(), 2);
		Assert.assertEquals(singlyLinkedList.getTail().getData(), 20);
		Assert.assertNull(singlyLinkedList.getTail().getNext());
	}

	@Test
	public void testAddElementAtPosition() throws Exception {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addFirstElement(10);
		singlyLinkedList.addLastElement(15);
		singlyLinkedList.addLastElement(20);
		singlyLinkedList.addElementAtPosition(2, 17);
		Assert.assertEquals(singlyLinkedList.getSize(), 4);
		Assert.assertEquals(singlyLinkedList.getHead().getNext().getNext()
				.getData(), 17);
	}

	@Test
	public void testRemoveFirstElement() throws Exception {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addFirstElement(10);
		singlyLinkedList.addLastElement(15);
		singlyLinkedList.addLastElement(20);
		singlyLinkedList.addElementAtPosition(2, 17);
		singlyLinkedList.removeFirstElement();
		Assert.assertEquals(singlyLinkedList.getSize(), 3);
		Assert.assertEquals(singlyLinkedList.getHead().getData(), 15);
	}

	@Test
	public void testRemoveLastElement() throws Exception {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addFirstElement(10);
		singlyLinkedList.addLastElement(15);
		singlyLinkedList.addLastElement(20);
		singlyLinkedList.addElementAtPosition(2, 17);
		singlyLinkedList.removeLastElement();
		Assert.assertEquals(singlyLinkedList.getSize(), 3);
		Assert.assertEquals(singlyLinkedList.getTail().getData(), 17);
	}

	@Test
	public void testRemoveAllElementWithTargetValue() throws Exception {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.addFirstElement(10);
		singlyLinkedList.addLastElement(15);
		singlyLinkedList.addLastElement(10);
		singlyLinkedList.addElementAtPosition(2, 17);
		singlyLinkedList.removeAllElementWithTargetValue(10);
		Assert.assertEquals(singlyLinkedList.getSize(), 2);
		Assert.assertEquals(singlyLinkedList.getHead().getData(), 15);
		Assert.assertEquals(singlyLinkedList.getTail().getData(), 17);
	}

}
