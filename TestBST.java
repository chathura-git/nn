class TestBST
{
	public static void main(String [] args)
	{
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert("Java","Chathura","Mahe",1200);
		bst.insert("Android","Dumidu","Munasinghe",250);
		bst.insert("C++","Ishanka","Anurada",750);
		bst.insert("Advanced Java","Lasith","Anurada",800);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		//bst.insert("","","",);
		
		Node n = bst.search("Java");
		
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