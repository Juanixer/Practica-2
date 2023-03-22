limpiar:
	rm -rf bin
	rm -rf *.jar
	rm -rf *.class
compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin
jar:compilar
	jar cvfm aplicacion.jar Manifest.txt -C bin .
ejecutar:jar
	java -jar aplicacion.jar

javadoc:ejecutar
	find . -type f -name "*.java" | xargs javadoc -d html -encoding utf-8 -docencoding utf-8 -charset utf-8
