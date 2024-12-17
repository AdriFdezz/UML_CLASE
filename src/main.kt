fun main() {
    // Crear curso
    val cursoMatematicas = Curso("Matemáticas", "MAT101")

    // Crear estudiantes
    val estudiante1 = Estudiante("Juan Pérez", "12345678X")
    val estudiante2 = Estudiante("Ana López", "87654321Y")

    // Inscribir estudiantes en el curso
    estudiante1.inscribirse(cursoMatematicas)
    estudiante2.inscribirse(cursoMatematicas)

    // Mostrar los estudiantes inscritos
    estudiante1.mostrarInscritos(cursoMatematicas)
}
