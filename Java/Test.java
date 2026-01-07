abstract class A5{
		private void doSomeThing(){
			System.out.println("ABC");
			System.out.println("CDC");
		}
  }
class B extends A5{
		protected void doSomeThing(){
			System.out.println("BBC");
			System.out.println("EDC");
		}
  }
Public class Test {
		Public static void main(String args[]){
			A5 a=new B();
			a.doSomeThing();
		}
  }
