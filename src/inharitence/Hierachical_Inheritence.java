package inharitence;

public class Hierachical_Inheritence {

	public static void main(String[] args) {
		System.out.println("Mother Have -");
		Mother m=new Mother();
		m.money();
        Mother.home();
        System.out.println("================");
        System.out.println("Daughter Have-");
        Daughter d=new Daughter();
		d.money();
		Daughter.home();
		d.mobile();
		Daughter.cash();
		System.out.println("-----------------------------");
		System.out.println("ChildSon Have-");
		ChildSon ch=new ChildSon();
		ch.money();
		ChildSon.home();
		ch.technic();
		ChildSon.books();

	}

}
