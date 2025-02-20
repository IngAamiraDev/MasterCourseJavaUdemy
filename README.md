# Curso de Java

## Tabla de Contenido

1. [Introducción](#introducción)
2. [Variables y Tipos Primitivos](#variables-y-tipos-primitivos)
3. [Strings](#strings)
4. [Operadores](#operadores)
5. [Flujos de Control](#flujos-de-control)
6. [Clases Wrapper](#clases-wrapper)
7. [Fechas y Tiempo](#fechas-y-tiempo)
8. [Sistema y Matemáticas](#sistema-y-matemáticas)
9. [Arreglos](#arreglos)
10. [Matrices](#matrices)
11. [Programación Orientada a Objetos (POO)](#programación-orientada-a-objetos-poo)
12. [Paquetes y Control de Acceso](#paquetes-y-control-de-acceso)
13. [Sobrecarga y Herencia](#sobrecarga-y-herencia)
14. [Clases Abstractas e Interfaces](#clases-abstractas-e-interfaces)
15. [Interfaces](#interfaces)
16. [Colecciones y Genéricos](#colecciones-y-genéricos)
17. [Hilos (Threads)](#hilos-threads)
18. [Expresiones Lambda y Streams](#expresiones-lambda-y-streams)
19. [Optional](#optional)
20. [Fechas y Tiempo (Java 8+)](#fechas-y-tiempo-java-8)
21. [Anotaciones](#anotaciones)
22. [Patrones de Diseño](#patrones-de-diseño)
23. [Manejo de Archivos](#manejo-de-archivos)
24. [Bases de Datos y JDBC](#bases-de-datos-y-jdbc)
25. [Pool de Conexiones y Transacciones](#pool-de-conexiones-y-transacciones)
26. [Java Swing](#java-swing)
27. [Pruebas Unitarias (JUnit)](#pruebas-unitarias-junit)
28. [Mockito](#mockito)
29. [Servlets y Java EE](#servlets-y-java-ee)
30. [CDI (Contexts and Dependency Injection)](#cdi-contexts-and-dependency-injection)
31. [JPA (Java Persistence API)](#jpa-java-persistence-api)
32. [EJB (Enterprise JavaBeans)](#ejb-enterprise-javabeans)
33. [JSF (JavaServer Faces)](#jsf-javaserver-faces)
34. [Web Services](#web-services)
35. [Seguridad (JAAS)](#seguridad-jaas)
36. [Spring Boot](#spring-boot)
37. [React](#react)
38. [Angular](#angular)
39. [JavaFX](#javafx)
40. [WebSocket](#websocket)
41. [MongoDB](#mongodb)
42. [Reactor API (Programación Reactiva)](#reactor-api-programación-reactiva)
43. [WebFlux](#webflux)
44. [Conclusión](#conclusión)

### Introducción
- Antes de comenzar
- Instalación JDK
- Creando nuestra primera aplicación
- Ejemplo Hola Mundo en Java
- Imprime tu nombre en consola

### Variables y Tipos Primitivos
- Introducción a las variables
- Ejemplos de variables
- Introducción a los primitivos
- Primitivos numéricos enteros
- Primitivos numéricos de punto flotante
- Primitivos numéricos de punto flotante y sus constantes
- Primitivo char o caracter
- Char y caracteres especiales
- Primitivo boolean o lógico binario
- Sistemas numéricos: decimal, binario, octal y hexadecimal
- Sistemas numéricos y entradas de datos desde ventana de diálogo
- Sistemas numéricos y entradas de datos desde el terminal
- Conversión de cadenas a primitivos
- Conversiones de tipo primitivos a cadenas
- Conversiones entre tipos primitivos

### Strings
- Introducción a los String
- Creando objeto String en la literal vs operador new
- Concatenando String
- Inmutabilidad
- Test rendimiento concatenar con operador (+) vs método concat() vs StringBuilder
- Métodos importantes del objeto String parte 2
- Algunos métodos útiles para convertir un String en un Arreglo

### Operadores
- Introducción a los operadores
- Operadores Aritméticos
- Operadores de Asignación
- Operadores Unarios
- Operadores de Incremento y Decremento
- Operadores Relacionales
- Operadores Lógicos
- Precedencia en los operadores lógicos
- Operador Ternario
- Ejemplo login con operador ternario
- Operador Instanceof (Tipo de)
- Operador Instanceof con tipos abstractos
- Precedencia de los operadores

### Flujos de Control
- Introducción a flujos de control
- Flujo de control if else
- Flujo de control switch case
- Sentencia switch case ejemplo nombre del mes
- Switch case ejemplo número de días del mes
- Introducción a flujos de control de bucles
- Iterando arreglos con sentencia for y palabras reservadas break y continue
- Flujo de control while y do while
- Etiquetas en las sentencias for y while
- Ejemplo buscar con sentencias for anidadas y etiquetas
- Modo depuración sentencias if else y switch case
- Modo depuración sentencias for y foreach

### Clases Wrapper
- Introducción a las clases Wrapper
- Clase Wrapper Integer
- Autoboxing y unboxing
- Clases Wrapper numéricas y operadores relacionales
- Clase Wrapper Boolean
- El método getClass() del objeto para reflexión y metadata
- Pasar argumento por valor
- Pasar argumento por referencia
- Pasar argumento por referencia objeto persona

### Fechas y Tiempo
- La clase Date y formatos de fechas
- Tiempo en milisegundos con método getTime()
- La clase Calendar
- Convertir una fecha String a objeto del tipo Date
- Comparar fechas

### Sistema y Matemáticas
- Obtener propiedades del sistema
- Agregar y customizar propiedades y configuraciones de la aplicación
- Obtener las variables de ambiente del sistema operativo
- Otras características y funciones útiles de la clase System
- La clase Runtime para ejecutar aplicaciones del S.O
- La clase Math parte 1
- La clase Math parte 2 (trigonometría)
- La clase Math y el método random() para generar números aleatorios
- La clase Random de java util

### Arreglos
- Línea de comando compilar y ejecutar con argumentos
- Pasar argumentos de línea de comando en IntelliJ
- Ejemplo de un arreglo de enteros
- Iterando arreglos
- Modificando el arreglo en reverso
- Ordenamiento algoritmo burbuja
- Ordenamiento algoritmo burbuja método optimizado
- Reutilizando algoritmo burbuja
- Imprimiendo el i-ésimo número por el principio y el i-ésimo por el final
- Combinar dos arreglos en un tercero
- Combinar dos arreglos en un tercero con múltiples elementos
- Obtener el número mayor de un arreglo de enteros
- Detectar orden del arreglo
- Copiar pares e impares de un arreglo de enteros y en sus respectivos arreglos
- Sistema de notas de alumnos por asignaturas
- Buscar elementos en un arreglo
- Mover los elementos en una posición desde el inicio del arreglo hasta el final
- Agregar un elemento en una posición indicada y mover los siguientes elementos
- Agregar un elemento en una posición adecuada de manera que se mantenga ordenado
- Eliminar un elemento del arreglo
- Insertando un nuevo elemento e incrementando el tamaño del arreglo
- Ordenar el arreglo de la forma último primero, etc

### Matrices
- Introducción a las matrices
- Ejemplo de una matriz de enteros
- Ejemplo de un arreglo de string e iterando con for
- Tamaños de columnas variable en una matriz
- Buscando un elemento en una matriz usando etiquetas y break
- Ejecutando en modo depuración
- Matriz simétrica
- Convertir a la matriz transpuesta
- Creando la matriz transpuesta de una matriz
- Operaciones aritméticas en matrices
- Sumar filas y columnas de una matriz
- Límites inferior y superior de la matriz y la diagonal principal

### Programación Orientada a Objetos (POO)
- Creando nuestra primera clase
- Creando objetos con el operador new
- Agregando métodos
- Métodos con argumentos
- Principio de ocultación de los atributos
- Ocultación métodos get y set
- Implementando constructor
- Sobrecarga de constructores
- El método equals
- El método equals segunda parte
- El método toString
- Atributos y métodos estáticos de la clase
- Atributos y métodos estáticos 2º parte
- Atributos constantes final
- Atributos constantes final 2º parte (colores)
- Enumerador Color (enum)
- Implementando enumerador con más atributos
- Utilizando enum con sentencias switch case
- Iterando enum con foreach
- Diagrama de clases UML y relaciones de clases/objetos
- Creando las clases relacionadas
- Modificando clase con atributos de relaciones de objetos
- Soluciones a posibles errores NullPointerException
- Relacionando los demás objetos
- Añadiendo el método add para agregar elementos de un arreglo
- El método compareTo para ordenar objetos y Descargar Código Fuente

### Paquetes y Control de Acceso
- Introducción a los paquetes
- Creando nuestros primeros package y sus clases
- Control de acceso mediante modificadores
- Alcance de los modificadores de accesos
- Import estático

### Sobrecarga y Herencia
- Introducción a la sobrecarga
- Implementando clase con sobrecarga de métodos
- Corriendo ejemplo sobrecarga en modo debug
- Varargs número variable de argumentos
- Sobrecarga y métodos estáticos
- Introducción a la herencia
- Creando la jerarquía de clases
- Sobre el modificador de acceso protected
- Herencia y el API de reflexión de java
- Llamando a los constructores en cadena
- La referencia super en constructor
- Creando instancias vía constructores con argumentos y control de tipos
- Sobre escritura de métodos en la herencia
- Sobre escritura método toString
- Debug mode
- Modificador final para evitar la herencia y la sobre-escritura de métodos
- Resumen con diagrama UML de Clases

### Clases Abstractas e Interfaces
- Introducción a las clases abstractas
- Diseño de clases UML
- Creando clase padre abstracta ElementoForm
- Creando clases hijas concretas InputForm y TextareaForm
- Creando la clase concreta SelectForm
- Creando la clase ejemplo con el método main EjemploForm
- Dibujando elementos del formulario
- Clases Anónimas
- Creando la clase abstracta Validador con tres clases hijas concretas
- Creando la clase concreta LargoValidador para validar el min y máx de caracteres
- Creando la clase concreta EmailValidador
- Implementando la validación en la clase abstracta ElementoForm
- Validando los elementos del formulario
- Añadiendo el nombre del campo en los mensajes de errores
- Implementando interface para formatear mensajes de errores

### Interfaces
- Introducción a las interfaces
- Creando nuevo proyecto y clase abstracta con su jerarquía
- Añadiendo nueva clase concreta a la jerarquía
- Creando la clase ejemplo con el método main
- Añadiendo la clase Libro y la interface
- Añadiendo algunas mejoras y optimizaciones en el código
- Métodos default y static en interfaces

### Colecciones y Genéricos
- Introducción a las Excepciones en Java
- Ejemplos de manejos de excepciones no comprobadas (unchecked)
- Implementando nuestras propias excepciones checked
- Implementando nuestras propias excepciones checked - parte 2
- Manejo de Excepciones en el ejemplo Crud Repositorio
- Manejo de Excepciones en el ejemplo Crud Repositorio - parte 2
- Introducción
- Ejemplo HashSet
- Ejemplo HashSet detectando duplicados
- Ejemplo TreeSet
- Ejemplo TreeSet Comparable y Comparator
- Singularidad en TreeSet y HashSet
- Formas de loop o iteraciones en los Collection Set y List
- Ejemplo ArrayList Comparable y Comparator
- Ejemplo ArrayList métodos más importantes
- Ejemplo LinkedList (Lista Doblemente Enlazada) - Pilas y colas
- List Iterator
- Ejemplo HashMap
- Ejemplo HashMap métodos más importantes
- Ejemplo HashMap con valor del tipo Object y relaciones de objetos
- Ejemplo HashMap con valor del tipo Object y relaciones de objetos - parte 2
- Ejemplo TreeMap y Descargar Código Fuente

### Hilos (Threads)
- Introducción a los Threads
- Creando hilos heredando de la clase Thread
- Creando hilos implementando la interface Runnable
- Implementando hilos con expresiones lambda y Runnable
- El método join vs sleep
- Usando modificador synchronized para la sincronización de hilos
- Métodos wait() y notify() sincronización Productor Consumidor
- Métodos wait() y notify() sincronización Productor Consumidor - parte 2
- Ejemplo de sincronización Productor Consumidor con Java 8 Lambda
- Usando Timer y TimerTask para agendar tareas programadas
- Agendando tareas programadas que se repiten cada cierto periodo de tiempo
- Executor Framework - Single Thread Executor
- Executor Framework - Future
- Executor Framework - Fixed Thread Pool
- Executor Framework - Personalizando parámetros del pool con ThreadPoolExecutor
- Executor Framework - Tareas programadas con ScheduledExecutorService
- Executor Framework - Tareas programadas que se repiten cada cierto periodo

### Expresiones Lambda y Streams
- Expresiones Lambda Consumidores o Consumer
- Referencias de métodos en expresiones lambda de tipo Consumer
- Expresiones Lambda Function
- Expresiones Lambda Predicate
- Creando nuestra propia expresión lambda con una interfaz funcional
- Introducción a los Streams
- Creando un Stream
- El operador map
- El operador map parte 2
- El operador filter
- El operador anyMatch
- Un resumen al API Optional de java 8
- Operadores varios filter(), distinct(), reduce(), sum() y summaryStatistics()
- Operadores mapToInt(), sum() y summaryStatistics()
- Operador flatMap()
- Convertiendo un List a un Stream
- Generando Stream infinito o bien emitiendo elementos en un intervalo de tiempo
- Ejemplo flatMap facturas de usuarios
- Operador parallel()

### Optional
- Introducción a la clase Optional
- Ejemplo Repositorio usando Optional
- Optional métodos orElse() vs orElseGet()
- Optional método orElseThrow()
- Optional operadores map(), filter() y flatMap()

### Fechas y Tiempo (Java 8+)
- Introducción
- Trabajando con LocalDate para fechas
- Trabajando con LocalTime para hora tiempo
- Formateando hora tiempo con DateTimeFormatter
- Trabajando con LocalDateTime para fecha y hora
- Trabajando con zonas horaria usando ZonedDateTime
- Trabajando con zonas horaria usando ZonedDateTime parte 2
- Trabajando con periodos y duración

### Anotaciones
- Introducción y creando nuestra primera anotación
- Procesando las anotaciones usando el api de reflexión de java
- Creando la clase procesador JsonSerializador y agregando capitalizador
- Añadiendo nueva anotación para método @Target METHOD
- Creando la clase Componente recursiva
- Añadiendo método recursivo que recorre el árbol

### Patrones de Diseño
- Patrón Singleton
- Patrón Abstract Factory
- Patrón Abstract Factory parte 2
- Patrón Abstract Factory parte 3
- Patrón Decorator
- Patrón Decorator parte 2
- Patrón Composite
- Patrón Composite parte 2
- Patrón Observer

### Manejo de Archivos
- Creando archivos
- Usando BufferedWriter y PrintWriter
- Leer archivos

### Bases de Datos y JDBC
- Introducción SQL
- Instalación MySQL
- Creando el esquema de base de datos
- Introducción al API JDBC
- Actualización creando proyecto Maven en IntelliJ
- Creando nuestro proyecto Java con JDBC
- Cerrando conexiones, recursos y manejo de errores
- Añadiendo la clase singleton de conexión a la base de datos
- La interface Repositorio
- Implementando la clase Repositorio
- Implementando la clase Repositorio parte 2
- Implementando la clase Repositorio parte 3 el CRUD
- La clase Repositorio parte 4 probando el CRUD
- Relaciones de tablas creando esquema DDL
- Relaciones de objetos del modelo o DTO
- Una conexión por sentencia u operación

### Pool de Conexiones y Transacciones
- Introducción
- Implementando pool de conexiones y Descargar Código Fuente
- Introducción
- Ejemplo Transacciones Singleton
- Ejemplo Transacciones Singleton parte 2
- Ejemplo Transacciones con pool de conexiones
- Ejemplo Transacciones con pool de conexiones parte 2
- Ejemplo Transacciones con pool de conexiones parte 3 (obtener último insert id)
- Ejemplo Transacciones con pool de conexiones parte 4
- Agregando la interface Service y su clase de implementación transaccional
- Implementando los métodos de la clase Service
- Utilizando la clase Service en la clase de ejemplo con el main

### Java Swing
- Hola Mundo con Swing
- Java Swing Layout
- Ejemplo copiar texto de un campo a otro y contador
- Ejemplo Conversor de monedas
- Ejemplo Calculadora usando JMenuBar
- Ejemplo Calculadora con GridLayout y JButton
- Ventanas de Dialogo de Alerta y de Opciones
- Ventanas de Confirmación Ok/Cancel
- Grilla o TableModel (DataTable)
- Componente Formulario
- Componente Grilla/TableModel
- Modificando datos y validación del formulario
- Eliminando registro del TableModel
- Copiar inserts into con datos de ejemplo para la siguiente clase
- Creando las tablas en MySQL y configurando dependencias de JDBC
- Implementando clase Repository para el CRUD
- Agregando persistencia a la Base de Datos en Swing con el CRUD Repository

### Pruebas Unitarias (JUnit)
- Introducción pruebas unitarias
- Introducción JUnit 5
- Actualización creando proyecto Maven en IntelliJ
- Creando y configurando el proyecto con JUnit 5
- Escribiendo y ejecutando primeras pruebas unitarias con Assertions
- Escribiendo test para el saldo
- Test driven development TDD con JUnit
- TDD para debito y crédito
- Probando y afirmando excepciones con assertThrows en JUnit 5
- Añadiendo la clase Banco y la relación con las cuentas
- Probando y afirmando las relaciones entre Banco y Cuenta
- Usando el método assertAll
- Agregando mensajes de falla en los métodos assertions
- Usando anotaciones @DisplayName y @Disabled
- Ciclo de vida anotaciones @AfterEach y @BeforeEach
- Ciclo de vida anotaciones @AfterAll y @BeforeAll
- Test condicionales @EnabledOnOs, @EnabledOnJre, @EnabledIfSystemProperty etc...
- Ejecuciones de test condicionales con @EnabledIfEnvironmentVariable
- Ejecución de test condicional con Assumptions programáticamente
- Clases de test anidadas usando @Nested
- Repitiendo pruebas con @RepeatedTest
- Escribiendo pruebas parametrizadas con @ParameterizedTest
- Pruebas parametrizadas con @ParameterizedTest parte 2
- Pruebas parametrizadas con @ParameterizedTest parte 3
- Tagging tests con anotación @Tag
- Inyección de Dependencia & componentes testInfo y TestReporter
- Timeout en JUnit 5
- Maven surefire plugin y Descargar Código Fuente

### Mockito
- Introducción
- Creando y configurando el proyecto con JUnit 5 y Mockito
- Implementando la clase Service
- Realizando primeras pruebas con mockito
- Agregando nuevas dependencias mock
- Probando nuevas dependencias mock
- Probando con verify
- Inyección de dependencia y anotaciones @Mock, @InjectMock y @ExtendWith
- Realizando más pruebas del repositorio con el método guardar
- Test del id incremental en el método guardar usando Invocation Argument

### Servlets y Java EE
- Introducción al Protocolo HTTP
- Introducción a Jakarta EE 9 (Java EE)
- Actualización creando proyecto Maven en IntelliJ IDEA [Recuerdo]
- Instalando Apache Tomcat 10
- Creando y configurando un proyecto Java EE en IntelliJ
- Introducción a los Servlets
- Primer ejemplo con Servlet
- Enviando parámetros GET de la url o Query String
- Enviando múltiples parámetros GET url
- Nuevo Servlet y enviar parámetros
- Creando nuevo proyecto form
- Creando la clase servlet para procesar el formulario
- Agregando elementos select y checkbox en el html
- Procesando elementos select y checkbox en el servlet
- Agregando otros campos de radio button, checkbox y hidden
- Validando formulario
- Mostrando los mensajes de error en la vista jsp sobre el formulario
- Visualizando los mensajes de error debajo de cada campo en el form
- Aplicando estilos CSS con Bootstrap
- Manteniendo valores del formulario y selecciones al validar
- Generación de Formulario y validación
- Cabeceras HTTP del request
- Cabeceras HTTP Response para exportar a Excel
- Cabeceras HTTP Response para generar una respuesta en Json (API Rest)
- Cabeceras HTTP para enviar un objeto Json en el cuerpo del request (API Rest)
- Cabeceras HTTP Response Location vs Dispatcher forward
- Status HTTP Response 401 No Autorizado
- Status HTTP Response 404 No Encontrado
- Refactorización del buscador de producto
- Introducción y nuevo proyecto
- Sistema de login con cookies
- Sistema de login con cookies parte 2 protegiendo recursos
- Sistema de login con cookies parte 3 cerrando sesión logout
- Aplicar estilos CSS usando cookies
- Introducción y nuevo proyecto
- Sistema de login con http session
- Ingresa tu nombre de sesión
- Creando clases Carro e ItemCarro
- Agregando items al carro de compras
- Ver carro de compras
- Actualizar y eliminar ítems del carro de compras
- Introducción a los Listeners
- Guardando atributos de contextos
- Listener nombre y apellido
- Implementando un filtro que valida la sesión de usuario o login
- Implementar filtro que calcule el Tiempo Transcurrido
- Implementando filtro HTTP para la conexión a la Base de Datos
- Añadiendo la interfaz repositorio y su implementación con JDBC
- Implementando el componente Service con JDBC
- Instalando el driver MySQL en el servidor Tomcat y modificando los Servlets
- Modificando el listado de productos con vista JSP y MVC
- Listado de cursos y búsqueda de información
- Añadiendo relación entre producto y categoría y otros atributos
- Implementando CRUD (insert, update y delete) en el Repository o Dao
- Agregando Repositorio de categoría y Service guardar e eliminar
- Agregando formulario para crear
- Procesando el formulario con doPost para crear
- Validando el formulario
- Implementando formulario editar
- Implementando editar procesar form
- Implementando eliminar y dando seguridad a nuestras rutas del CRUD
- Crud completo de los cursos
- Migrando a JSTL en la vista JSP listar
- Migrando a JSTL en JSP form
- Migrando a JSTL en JSP carro de compras
- Migrar tarea anterior (proyecto de cursos) a JSTL
- Agregando estilos CSS Bootstrap
- Implementando sistema de layout en JSP
- Agregando menú de navegación en el header del layout
- Agregar layout y estilos Bootstrap CSS
- Creando el esquema de la tabla usuarios y la clase UsuarioRepositorio
- Implementando la clase UsuarioService para el proceso de login y servlet
- Crud completo de los usuarios
- Configurando el pool de conexiones
- Configurar pool de conexiones en la penúltima tarea de proyecto cursos

### CDI (Contexts and Dependency Injection)
- Introducción a CDI
- Demostración de lo que lograremos al final de la sección
- Configurando proyecto y bean carro con alcance @SessionScope
- Registrando conexión JDBC en contenedor CDI
- Componentes CDI Repositories y Services
- Inyectando beans Services en los Servlets
- Bean LoginService y la anotación @Resource
- Calificadores con la anotación @Qualifier
- Estereotipos con la anotación @Stereotype
- Bean discovery mode en annotated y anotación @Disposes para cerrar recursos
- Ciclo de vida de los beans con anotaciones @Postconstruct y @Predestroy
- Manejo de interceptores CDI
- Manejo de transacciones usando interceptores y anotaciones
- Crear proyecto Produces Factura usando Anotaciones
- Migrar penúltima tarea (pool conexiones cursos) a CDI con anotaciones

### JPA (Java Persistence API)
- Introducción
- Creando proyecto y configuraciones JPA persistence.xml
- Creando la clase entity de persistencia
- Sentencia HQL select y configurando el EntityManagerFactory
- Clausula where HQL
- Métodos SingleResult vs ResultList
- Crear registros con el método persist del EntityManager
- Actualizar registros con el método merge del EntityManager
- Eliminar registros con el método remove
- El componente crud repositorio
- El componente service
- Probando el service en una clase cliente con el método main
- JPQL campos personalizados
- JPQL instanciación dinámica de clase personalizada
- Usando DISTINCT palabra clave de JPQL / HQL
- Funciones JPQL concat, upper, lower y operador like
- Usando palabras claves between y order by de JPQL
- Funciones JPQL de agregación count, sum, max, min, avg
- Subquery o subconsulta en JPQL
- El API Criteria
- Operadores like y between
- Operadores in, gt (mayor que), ge (mayor que o igual), lt (menor que) y le
- Predicados conjunción and y disyunción or
- Clausula order by, ejemplo con single result por id, distinct nombre y upper
- Funciones de expresión concat, upper y lower
- Cláusula multiselect para campos personalizados
- Funciones de agregación count, sum, max, min
- Búsqueda dinámica con el API Criteria
- Eventos del Ciclo de Vida @PrePersist y @PreUpdate
- Anotaciones @Embeddable y @Embedded
- Generación Automática de las tablas con schema generation drop-and-create
- Creando nuevo proyecto y la relación ManyToOne
- Codificando ejemplo ManyToOne
- La relación OneToMany
- Codificando ejemplo OneToMany
- Esquema con tabla de enlace en OneToMany
- Eliminar objetos dependientes o hijos en la relación OneToMany
- Relación OneToMany Bidireccional
- Eliminar objetos dependientes en OneToMany Bidireccional
- Relación OneToOne
- Relación OneToOne Bidireccional
- Relación ManyToMany
- Relación ManyToMany parte 2 otros detalles
- Relación ManyToMany Bidireccional
- Introducción a Fetch Type
- FetchType Lazy en asociación @OneToMany
- FetchType Lazy en asociación @OneToMany usando join fetch
- Fetch en asociaciones @OneToMany y @OneToOne usando ResultList
- Fetch en asociaciones @ManyToMany usando ResultList
- API Criteria y Join Fetch en asociación ManyToOne
- API Criteria y Join Fetch en asociación OneToMany
- Creando nuevo proyecto webapp Servlet y configuraciones JPA
- Implementando clases Entities y configurando Entity Manager
- Implementando repositorios JPA
- El service con repositorio JPA y manejo de transacciones con anotaciones
- Probando nuestra webapp JPA

### EJB (Enterprise JavaBeans)
- Introducción a los EJB
- Instalando Servidor WildFly y nuevo proyecto EE 9 con soporte EJB
- Primer ejemplo con EJB
- Ejemplo EJB @Stateless vs @Stateful
- Obteniendo EJB programáticamente usando InitialContext lookup con JNDI
- La interfaz @Local
- Añadiendo otros métodos a la interfaz @Local
- Ejemplo con la interfaz @Remote
- Despliegues (deployments) en consola admin web de Wildfly
- Creando estructura modular EAR
- Configurando Datasource en servidor Wildfly y persistencia JPA en el módulo ejb
- Implementando repositorio con JPA (componente CDI) y service EJB en módulo ejb
- Implementando e inyectando EJB en Servlet en módulo war
- Migrando proyecto productos webapp-jpa a EJB en WildFly
- EntityManager manejado por el contenedor con @PersistenceContext

### JSF (JavaServer Faces)
- Introducción JSF3
- Creando nuevo proyecto webapp JSF
- La clase controller CDI
- Configurando JPA
- Añadiendo el Repository Service EJB y probando en controller CDI
- Implementando plantilla formulario y procesar
- Agregando crear con JPA
- Form CRUD completo editar y eliminar
- Form campo fecha
- Form lista select o combo box
- Clase converter para lista select
- Validación formulario usando anotaciones
- Aplicando estilos CSS con Bootstrap
- Sistema de Layouts o templates
- Mensajes Flash
- Configurando archivos de idiomas properties (Resource Bundle)
- Implementando controlador para cambiar el idioma
- Utilizando e injectando los textos de idioma (resource bundle) en el controlador
- Instalación y Componentes UI
- Primefaces parte 2 paneles, form layout y Ajax
- Implementando buscador con Ajax
- Implementando ventana de modal o dialogo con Ajax

### Web Services
- Introducción a los Web Services
- Introducción SOAP Web Services
- Implementando y publicando Web Services JAX-WS
- Cliente para consumir Web Services
- Ejemplo JAX-WS EJB y JPA
- Introducción RESTful y demostración
- Ejemplo implementando JAX-RS parte 1
- Ejemplo implementando JAX-RS parte 2
- Ejemplo Cliente HTTP con RESTEasy JAX-RS parte 1
- Ejemplo Cliente HTTP con RESTEasy JAX-RS parte 2
- Ejemplo JAX-RS con relaciones de objetos entities y JSON anidados
- Ejemplo JAX-RS con relaciones cíclica de objetos y problema de recursividad

### Seguridad (JAAS)
- Introducción JAAS
- Implementando seguridad JAAS en aplicación web empresarial (EJB y JSF3)
- Páginas JSF personalizadas de form login y error
- Logout o cerrar sesión
- Implementando seguridad JAAS en Servicios Web Restful
- Añadiendo reglas de seguridad a rutas url y métodos http en archivo web.xml
- Implementando seguridad JAAS en Servicios Web SOAP
- Implementando seguridad JAAS en EJB Remote
- Comprobando seguridad programáticamente en los EJBs

### Spring Boot
- Introducción
- Controlador y vista
- Implementando JPA (Entity, Repository y Service)
- Introducción a Spring Data JPA
- Implementando el CRUD Controller
- List view
- Form view
- Configuración Base de Datos MySQL
- Validación de Formulario, CSS Bootstrap y otros detalles
- Implementando Rest Controller
- Creando Base de Datos en MySQL Workbench y probando con Postman

### React
- Introducción a React
- Instalando herramientas necesarias & Creando React App
- Creando Primer Componente
- Agregando Componente Form
- Implementando Eliminar y Modificar
- Implementando Service Cliente HTTP con Axios
- Consumindo API REST del Backend en React

### Angular
- Introducción a Angular
- Instalando herramientas necesarias
- Agregando Componente Table
- Agregando Componente Form
- Implementando Editar y Eliminar
- Validación de Formulario
- Implementando Service con HttpClient para consumir API Rest
- Consumindo API REST del Backend Spring Boot

### JavaFX
- Creando Java FX App
- Implementando Eliminar del ViewTable
- Implementando Form Crear
- Implementando Form Editar
- Implementando Botón Limpiar
- Implementando Service con WebClient para consumir API Rest
- Consumindo API REST del Backend Spring Boot

### WebSocket
- Introducción
- Creando el proyecto backend y configurando el servidor WebSocket (el Broker)
- Creando el proyecto frontend Angular e instalando librerías sockjs y stompjs
- Plantilla HTML del chat / enviar y recibir mensajes del Chat
- Notificar cuando un nuevo usuario se conecta al chat
- Notificar cuando un usuario está escribiendo
- Historial de mensajes del chat

### MongoDB
- Instalación Mongo DB y algunos ejemplos
- Agregando Clases del Modelo Document y Repository
- Creando proyecto JavaFX y Componentes UI (Interfaz de Usuario) del Chat
- Eventos de los Botones y Mensajes del Chat
- Recibiendo y Enviando Mensajes al Servidor WebSocket
- Historial de mensajes del chat
- Notificar cuando un usuario está escribiendo

### Reactor API (Programación Reactiva)
- Introducción
- Creando Proyecto con Reactor API
- El método subscribe y eventos onNext, onError y onComplete
- El Subscriber y Subscription
- Los operadores map y filter
- Los Observables son inmutables
- El operador flatMap
- Combinando dos flujos con el operador flatMap
- Combinando dos flujos con el operador zipWith
- Flux Range
- Flux Interval y Create
- Back pressure (contrapresión)

### WebFlux
- Creando Proyecto WebFlux y MongoDb Reactive
- Implementando handler controller
- Configurando componente Router Function
- Poblando con Datos de Ejemplo y Probando en Postman
- Validando campos

### Recusrsos
- [Master Completo Java de Cero a Experto](https://www.udemy.com/course/master-completo-java-de-cero-a-experto)