# Ejercicio: Sistema de Gestion de Pedidos

Supongamos que estás trabajando en un sistema de procesamiento de pedidos en un restaurante. El sistema debe permitir a los clientes realizar pedidos y a los empleados del restaurante gestionar esos pedidos. Implementa el patrón Command para este escenario.

1. Define la interfaz Command con un método execute().

2. Implementa clases concretas que implementen la interfaz Command para las siguientes acciones: agregar un artículo al pedido, eliminar un artículo del pedido y enviar el pedido.

3. Crea una clase Pedido que actúe como el receptor. Esta clase debería tener métodos para agregar, eliminar y enviar artículos del pedido.

4. Crea una clase Cocina que represente al invocador. Esta clase debe tener una cola de comandos y métodos para asignar y ejecutar comandos.

5. Crea una clase Cliente que utilice el patrón Command para realizar pedidos. El cliente debería poder agregar y eliminar artículos del pedido y enviar el pedido.