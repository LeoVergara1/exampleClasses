package clasess

class Service {

  String addPatasToAnimals(Perro perro, Gato gato){
    perro.patas = "patas de perro"
    gato.patas = "patas de gato"
    "hecho.... servicio"
  }

  Map leerXMLPerro(){
    def animal = new XmlSlurper().parse(new File('sources/animal.xml'))
    [name: animal.perro.name,
     cara: animal.perro.cara,
     patas: animal.perro.patas
     ]
  }
}
