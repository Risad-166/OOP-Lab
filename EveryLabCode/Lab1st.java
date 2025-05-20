public class Lab1st {

String name;
int id;
float cgpa;

void display(){
    System.out.println("Name is "+ this.name+"\n "+"ID is "+this.id+" CGPA " +this.cgpa);
}
void setValue(String name, int id, float cgpa)
{
    this.name=name;
    this.id=id;
    this.cgpa=cgpa;
}
  float getCgpa(){
    return cgpa;
  }


}
