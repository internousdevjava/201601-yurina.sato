
public class ClassTest {

		public static void main(String[] args){
			//Employeeクラスのインスタンスを作成し、参照先を変数に格納
			Employee yamamoto=new Employee("山本　太郎",2,20);
			Employee matsuda=new Employee("松田　次郎",4,25);
			Employee yasuda=new Employee("安田　三郎",28);
			Employee nanashi=new Employee();


			yamamoto.setName("山本　小太郎");		//変数yamamotoの従業員名を変更
			yasuda.setYear(+55);					//変数yasudaの入社年数を変更


			//変数yamamotoが参照しているインスタンスの各フィールドの値を画面に表示
			yamamoto.display();

			matsuda.display();

			yasuda.display();

			nanashi.display();
		}
}
