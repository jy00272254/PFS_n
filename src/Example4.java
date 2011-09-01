class 动物 {
	void cry()
	{
	}
}
class 狗 extends 动物{
	void cry()
	{
		System.out.println("汪汪~~~~");
	}
	void speak()
	{
		System.out.println("dog dog dog");
	}
}
class 猫 extends 动物
{
	void cry()
	{
		System.out.println("，喵喵~~~~");
	}
}
public class Example4
{
	public static void main(String args[])
	{
		动物 dongwu;
		dongwu=new 狗();
		dongwu.cry();
		if (dongwu instanceof 动物) {
			System.out.println("asdfasfsad");
		}
		dongwu=new 猫();
		dongwu.cry();
	}
}