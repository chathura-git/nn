class Test
{
	public static void main(String[] args) 
	{	 
	        BinarySearchTree theTree = new BinarySearchTree();	
 
	        theTree.insert(new Book("K","Boss","w",200));	 
	        theTree.insert(new Book("E","BossE","w",900));	 
	        theTree.insert(new Book("S","Vice President","x",600));	 
	        theTree.insert(new Book("B","Office Manager","y",400));	 
	        theTree.insert(new Book("G","Secretary","z",100));	 
	        theTree.insert(new Book("Q","Sales Manager","p",300));        
	        theTree.insert(new Book("V","Salesman 1","q",500));	 
			theTree.insert(new Book("A","Java","s",700));	 
	        theTree.insert(new Book("C","AlorithemC","t",800)); 
	        theTree.insert(new Book("F","AlorithemF","t",800)); 
	        theTree.insert(new Book("I","AlorithemI","t",800)); 
	        theTree.insert(new Book("P","AlorithemP","t",800)); 
	        theTree.insert(new Book("R","AlorithemR","t",800)); 
	        theTree.insert(new Book("T","AlorithemT","t",800)); 
	        theTree.insert(new Book("W","AlorithemW","t",800)); 
	        theTree.insert(new Book("D","AlorithemD","t",800)); 
	        theTree.insert(new Book("H","AlorithemH","t",800)); 
	        theTree.insert(new Book("M","AlorithemM","t",800)); 
	        theTree.insert(new Book("U","AlorithemU","t",800)); 
	        theTree.insert(new Book("L","AlorithemL","t",800)); 
	        theTree.insert(new Book("N","AlorithemN","t",800)); 
	        
			
			//theTree.remove("G");
			//System.out.println("Status: " + theTree.remove("G"));
			//System.out.println("Status: " + theTree.remove("E"));
			//System.out.println("Status: " + theTree.remove("B"));
			//System.out.println("Status: " + theTree.remove("A"));
			//System.out.println("Status: " + theTree.remove("C"));
			//System.out.println("Status: " + theTree.remove("F"));
			//System.out.println("Status: " + theTree.remove("I"));
			//System.out.println("Status: " + theTree.remove("D"));
			//System.out.println("Status: " + theTree.remove("H"));
			System.out.println("Status: " + theTree.remove("P"));
			
			
			Node n = theTree.search("Q");
			try{
			System.out.println(n.book.author_fname + "");
			}
			catch(Exception e){}
			try{
			System.out.println("Left Node: " + n.left.book.title);
			}
			catch(Exception e){}
			try{
			System.out.println("Right Node: " + n.right.book.title);
			}
			catch(Exception e){}
	 
	}
}