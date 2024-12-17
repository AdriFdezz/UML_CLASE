class Estudiante(
    private val nombre: String,
    private val dni: String
) {
    fun inscribirse(curso: Curso) {
        curso.agregarAlumno(this)
    }

    fun mostrarInscritos(curso: Curso) {
        val estudiantes = curso.obtenerEstudiantes()
        println("Estudiantes inscritos en el curso:")
        if (estudiantes.isEmpty()) {
            println(" - No hay estudiantes inscritos aún.")
        } else {
            estudiantes.forEach { estudiante ->
                println(" - ${estudiante.nombre} (DNI: ${estudiante.dni})")
            }
        }
    }
}
