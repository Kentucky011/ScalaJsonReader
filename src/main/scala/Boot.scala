import spray.json._
import DefaultJsonProtocol._
object Test extends App {

}

class ReaderConverterJson(val pathFromReadJson: String){
  def pathFromReadJson(pathFromReadJson: String): Unit = {
    val source = """{ "some": "JSON source" }"""
    println(source)
    val jsonAst = source
    val myObject = jsonAst.convertTo[Persons]
  }
}


case class Persons(val listPerson: List[Person]){
  // потом реализуем
}


case class Person(val name: String,
                  val age: Int,
                  val isMale: Boolean,
                  val listAdress: List[Adress],
                  listPets: List[Pets]) {
 // potom realizuem
}


case class Adress(val listPrevAdress: List[PrevAdress],
                  val city: String, val street: String,
                  val house: Int) {

}


case class PrevAdress(val listPrevReg: List[String]) {
  //potom realizuem
}


case class Pets(val listPet: List[Pet]) {
  //potom realizyem
}


case class Pet(val petType: String,
               val petName: String) {

}