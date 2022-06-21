public class Chapter2Video4 {
    public static void main (String[] args) {
        final Boolean IS_DEVELOPMENT = false;
        Dataloader dataloader= new Dataloader(IS_DEVELOPMENT);
        System.out.println(dataloader.loadPerson.apply());

    }
    protected static class Person {
        private String name;
        private Integer age;

        public Person (String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
    protected static class Dataloader {
        public final NoArgFunction<Person> loadPerson;

        public Dataloader(Boolean isDeveopment){
            this.loadPerson = isDeveopment
                    ? this::loadPersonFake
                    : this::loadPersonReal;
        }
        private Person loadPersonReal (){
            System.out.println("Loading person....");
            return new Person("Real Person", 34);
        }
        private Person loadPersonFake (){
            System.out.println("This is fake person");
            return new Person("Fake Person", 150);
        }
    }


}
