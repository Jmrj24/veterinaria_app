# 🐾 Veterinaria App

**Veterinaria App** es una aplicación backend diseñada para gestionar una clínica veterinaria, permitiendo administrar tanto las mascotas como sus dueños, con funcionalidades que facilitan la integración de futuros sistemas web y móviles.

---

## 📋 Descripción del Proyecto

El objetivo de esta aplicación es ofrecer un sistema que permita:

1. **CRUD completo** para mascotas y dueños.
2. Obtener un listado filtrado de mascotas de especie "perro" y raza "caniche".
3. Generar un listado combinado con información tanto de las mascotas como de sus dueños, incluyendo:
   - `nombre_mascota`
   - `especie`
   - `raza`
   - `nombre_dueño`
   - `apellido_dueño`

El desarrollo implementa el patrón **DTO** para estructurar y enviar las respuestas en los endpoints.

---

## 🛠️ Tecnologías Utilizadas

- **Java** ☕  
- **Spring Boot** 🌱  
- **MySQL** 🐬  
- **Maven** 🪶  

---

## ⚙️ Funcionalidades Principales

- **Gestión de Mascotas**:
  - Registro, actualización, eliminación y consulta de mascotas.
  - Atributos manejados: `id`, `nombre`, `especie`, `raza`, `color`.

- **Gestión de Dueños**:
  - Registro, actualización, eliminación y consulta de dueños.
  - Atributos manejados: `id`, `dni`, `nombre`, `apellido`, `celular`.

- **Listados Avanzados**:
  - Mascotas filtradas por especie "perro" y raza "caniche".
  - Datos combinados de mascotas y sus dueños.

---

## 📂 Estructura del Proyecto
**Mascota:**
- Modelo con atributos: id, nombre, especie, raza, color.
**Dueño:**
- Modelo con atributos: id, dni, nombre, apellido, celular.
**DTO:**
- Implementación del patrón DTO para la respuesta combinada.
