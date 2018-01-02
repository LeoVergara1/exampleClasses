package clasess


Perro perro = new Perro()
Gato gato = new Gato()
SqlConection sql = new SqlConection()
//Injectado servicio

Service service = new Service()

println "Asignando nombre para el perro"
perro.name = "Loky"
println "Mostrando instancia del perro ${perro.dump()}"
println "Asignando nombre para el gato"
gato.name = "Wine"
println "Ejecutando servicio de patas ...."
service.addPatasToAnimals(perro, gato)
println "Mostrando instancias de nuevo"
println "Perro: ${perro.dump()}"
println "Gato: ${gato.dump()}"

println "Ejecutanto metodos de instancias..."
perro.correr()
gato.corre()

println "Leyendo XML"
Map perroMap = service.leerXMLPerro()

println "Mostrando mapa del perro desde el XML"

println perroMap

println "Mostrando conexión a base"
println sql.dump()



