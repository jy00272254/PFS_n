class ���� {
	void cry()
	{
	}
}
class �� extends ����{
	void cry()
	{
		System.out.println("����~~~~");
	}
	void speak()
	{
		System.out.println("dog dog dog");
	}
}
class è extends ����
{
	void cry()
	{
		System.out.println("������~~~~");
	}
}
public class Example4
{
	public static void main(String args[])
	{
		���� dongwu;
		dongwu=new ��();
		dongwu.cry();
		if (dongwu instanceof ����) {
			System.out.println("asdfasfsad");
		}
		dongwu=new è();
		dongwu.cry();
	}
}