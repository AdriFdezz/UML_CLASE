class Curso(
    private val nombre: String,
    private val codigo: String
) {
    private val estudiantes = mutableListOf<Estudiante>()
    fun agregarAlumno(alu: Estudiante) {
        estudiantes.add(alu)
    }

    fun obtenerEstudiantes(): List<Estudiante> = estudiantes
}
