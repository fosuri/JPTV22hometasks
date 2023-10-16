package Bookslib;

class Author {
    private String name;
    private int age;

    public Author(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>=0) {
            this.age = age;
        }else{
            System.out.println("Возраст не может быть отрицательным.");
        }
    }

    @Override
    public String toString(){
        return "Author{name='" + name +'}';
    }
}