class Students {
    String name;

    Students() {
        name = "unknown";
    }

    Students(String name) {
        this.name = name;
    }

    public static void main(String args[]) {
        Students student = new Students();
        Students student1 = new Students("vishal");

    }

}