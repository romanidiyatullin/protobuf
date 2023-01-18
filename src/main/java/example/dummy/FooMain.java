package example.dummy;

import java.util.List;

public class FooMain {
    public static void main(String[] args) {
        FooOuterClass.Foo foo = FooOuterClass.Foo.newBuilder()
                .setId(12345)
                .setIsOk(true)
                .setValue("Hehey")
                .addAllNamesList(List.of("foo", "bar", "test"))
                .build();

        System.out.println(foo);
    }
}
