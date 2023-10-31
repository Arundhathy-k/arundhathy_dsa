package ArrayProblems;

public class ArrayProblemsDemo {
		int[] arr;
		int size;
		int capacity;
		ArrayProblemsDemo(int capacity){ 
			this.capacity = capacity; 
			arr = new int[capacity];
			size = 0;
			}
		void insertInEnd(int element) {
			arr[size++] = element; 
			}
		void insertAtIndex(int element, int index) {
			if(size==capacity) 
				return;
			for(int i=size-1;i>=index;i--) {
				arr[i+1] = arr[i]; // shifting all the elements one step right. starting from last element
				}
			arr[index] = element; // inserting value at the given index
			size++;
			}
		int deleteInEnd() {
			int deletedElement = arr[size-1];
			arr[size-1] = 0; // make the last value of index to 0 and reduce the size by 1
			size--;
			return deletedElement; 
		}
		int deleteAtIndex(int index) {
			if(index>=size)
				return-1;
			int deletedElement = arr[index];
			for(int i = index;i<size;i++)
				arr[i] = arr[i+1]; // simply replacing the value at index with its adjacent value
			size--;
			return deletedElement; 
		}
		void traversal() {
			System.out.println("\nArray: ");
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+ " "); 
				}
			System.out.println("\n"); 
			}
		public static void main(String[] args) {
			ArrayProblemsDemo ob = new ArrayProblemsDemo(10);
			ob.insertInEnd(20);
			ob.insertInEnd(1);
			ob.insertInEnd(3);
			ob.insertInEnd(14);
			ob.insertInEnd(32);
			ob.insertInEnd(67);
			ob.insertAtIndex(15, 1);
			ob.traversal();
			System.out.println("deleted value is: "+ob.deleteAtIndex(2));
			ob.traversal();
			
		}
		}
		
		
		
		

	


