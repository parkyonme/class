package people;

import people.Human;

public class HumanTest {

   public static void main(String[] args) {

      Human h = new Human();

      h.setName("박윤미");
      h.setAge(23);
      h.setSex("여");
      h.setHairColor("검정색");

      String name = "";
      int age = 0;
      String sex = "";
      String hairColor = "";
      
      name = h.getName();
      age = h.getAge();
      sex = h.getSex();
      hairColor = h.getHairColor();
      
      System.out.println(name);
      System.out.println(age);
      System.out.println(sex);
      System.out.println(hairColor);
            
   }

}
