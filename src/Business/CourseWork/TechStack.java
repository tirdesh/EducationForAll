/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseWork;


import java.util.List;

public class TechStack {
    private List<String> programmingLanguages;
    private List<String> frameworks;
    private List<String> tools;

    public TechStack(List<String> programmingLanguages, List<String> frameworks, List<String> tools) {
        this.programmingLanguages = programmingLanguages;
        this.frameworks = frameworks;
        this.tools = tools;
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(List<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public List<String> getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(List<String> frameworks) {
        this.frameworks = frameworks;
    }

    public List<String> getTools() {
        return tools;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }
}
