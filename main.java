
public class main {

	public static void main(String[] args) {

		System.out.println("running");
		RedBlackTree t = new RedBlackTree();
		t.insert(10);
		t.insert(5);
		t.insert(15);
		t.insert(1);

		t.printTree();
		System.out.println(t.isRedBlack());
		System.out.println(t.shortestTruePath());
		System.out.println(t.trueHeightDiff());
	}
}
