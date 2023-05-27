# Calculadora de Áreas y Perímetros

Este programa en Java y JSP permite calcular el área y perímetro de diferentes figuras geométricas, como triángulo, cuadrado, rombo, trapecio, círculo y rectángulo. Utiliza el patrón de diseño Singleton para garantizar una única instancia de la clase `Calculadora`.

## Requisitos

- Java Development Kit (JDK)
- Servidor web compatible con JSP (por ejemplo, Apache Tomcat)
- Navegador web

## Instrucciones

1. Clona o descarga este repositorio en tu máquina local.
2. Importa el proyecto en tu IDE de Java.
3. Configura el servidor web para ejecutar la aplicación.
4. Ejecuta la aplicación desde tu navegador web.
5. Ingresa los datos requeridos, como el tipo de figura geométrica y sus dimensiones.
6. Selecciona si deseas calcular el área o el perímetro.
7. Haz clic en el botón "Calcular".
8. El resultado del cálculo se mostrará en la pantalla.

## Estructura del proyecto

El proyecto contiene los siguientes archivos y carpetas:

- `src/Calculadora.java`: Clase que implementa la lógica de cálculo de áreas y perímetros.
- `src/CalculadoraServlet.java`: Servlet que procesa las solicitudes del cliente y utiliza la clase `Calculadora`.
- `web/formulario.jsp`: Página JSP que muestra el formulario de entrada de datos.
- `web/resultado.jsp`: Página JSP que muestra el resultado del cálculo.

## Patrón de diseño Singleton

La clase `Calculadora` utiliza el patrón de diseño Singleton para garantizar una única instancia de la clase. Esto se logra mediante el uso de un constructor privado y un método estático `getInstancia()` que devuelve la única instancia de la clase.

```java
public class Calculadora {
    private static Calculadora instancia = null;

    private Calculadora() {
        // Constructor privado para evitar instanciación directa
    }

    public static Calculadora getInstancia() {
        if (instancia == null) {
            instancia = new Calculadora();
        }
        return instancia;
    }

    // Resto de los métodos de cálculo de áreas y perímetros
    // ...

}
```

## Contribuciones
Las contribuciones son bienvenidas. Si encuentras algún problema o tienes alguna mejora para el programa, no dudes en crear un issue o enviar un pull request.

## Licencia
Este programa se encuentra bajo la Licencia MIT. Consulta el archivo LICENSE para obtener más detalles.

## Capturas
### Escoger una opción:
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/fe800915-71cf-43c7-8d05-66834432236f)

### Área de un triangulo:
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/efb445b6-2f3d-4c20-8549-d91fe41389e3)
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/afcd735e-c259-42f0-a280-092fa8ace63f)

### Área de un cuadrado:
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/ff58b8e8-1dab-4ca1-8cfa-be545e049a0e)
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/95e3fff7-376a-4347-a2c4-413b36dc30af)

### Perímetro de un cuadrado:
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/268a761e-786c-4580-b4c5-35411ea9a975)
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/b622d27a-7981-4170-ad99-778e369df471)

### Área de un rombo:
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/e247365a-c662-43b9-b379-3a2fd014b738)
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/68009a71-c142-44ca-8dbb-60e1e9a6ae5e)

### Perímetro de un rombo:
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/35fbb806-764d-4aae-9ebd-b0f4dfa41134)
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/319f0f4d-7ee3-40f2-ab5a-6e4d2b60c5ed)

### Área de un circulo:
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/b3a1561a-6d12-45ed-ab72-c59fc1fc3c69)
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/cbba4395-db95-4422-90a0-8d882a315275)

### Perímetro de un círculo:
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/2019d37f-baed-4223-a53a-eb0fa20dc1d3)
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/fe9d4233-35cb-46fc-ba1e-6ec1d9b800cb)

### Área de un rectángulo:
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/8f598e74-eab4-44fd-afbb-5e1f00541c46)
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/bb204da3-5955-421b-98b0-3c1a108847f2)

### Perímetro de un rectángulo:
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/efd13020-1391-4c9b-850c-0aca25c0a04c)
![image](https://github.com/JeisonRoblero/AreaFigurasSingleton/assets/89631773/016a0126-21e8-4a79-95ea-711d3fc7105a)



