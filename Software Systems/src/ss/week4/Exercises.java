package ss.week4;

public class Exercises {
    public static int countNegativeNumbers(int[] arr) {
        int count = 0;
    	for (int i = 0; i < arr.length; i++) {
        	if (arr[i] < 0) {
        		count++;
        	}
        }
    	return count;
    }

    public static void reverseArray(int[] ints) {
        for (int i = 0; i < ints.length / 2; i++) {
        	int temp = ints[ints.length - i - 1];
        	ints[ints.length - i - 1] = ints[i];
        	ints[i] = temp;
        }
    }

    class SimpleList {
        public class Element { }

        public class Node {
            public Node next;
            public Element element;
        }

        private Node first;

        private Node find(Element element) {
            Node p = first;
            if (p == null) {
                return null;
            }
            while (p.next != null && !p.next.element.equals(element)) {
                p = p.next;
            }
            if (p.next == null) {
                return null;
            } else {
                return p;
            }
        }

        public void remove(Element element) {
            Node p = find(element);
            if (p != null) {
                p.next = p.next.next;
            }
        }
    }
}
