package Courses;

import java.util.HashMap;
import java.util.Map;

public class CourseCatalog {
    private Map<String, Course> catalogoDeCursos = new HashMap<>();

    public CourseCatalog(){

    }

    public void adicionarCurso(Course curso){
        if(!this.catalogoDeCursos.containsKey(curso.getTitle())){
            this.catalogoDeCursos.put(curso.getTitle(), curso);
        }

    }

    public void listarCursos(){
        //this.catalogoDeCursos.
    }
}
