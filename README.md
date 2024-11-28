Проверим, что используем java 23
```shell
java -version
javac -version
```

Скомпилируем
```shell
javac -d output/ src/calculator/*.java
```

Запустим
```shell
java -cp output/ calculator.Main
```
