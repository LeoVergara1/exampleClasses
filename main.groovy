package clasess


Perro perro = new Perro()
Gato gato = new Gato()
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


