package cn.whpu.sky1;

import lombok.Data;

@Data
public class SimpleTest {
    private String name;
    private Integer age;
    
    public static void main(String[] args) {
        System.out.println("=== 开始测试 Lombok @Data 注解 ===\n");
        
        // 创建对象
        SimpleTest test = new SimpleTest();
        test.setName("张三");
        test.setAge(25);
        
        // 测试 getter 方法
        System.out.println("1. 测试 getter 方法:");
        System.out.println("   Name: " + test.getName());
        System.out.println("   Age: " + test.getAge());
        
        // 测试 setter 方法
        System.out.println("\n2. 测试 setter 方法:");
        test.setName("李四");
        test.setAge(30);
        System.out.println("   修改后 - Name: " + test.getName());
        System.out.println("   修改后 - Age: " + test.getAge());
        
        // 测试 toString 方法
        System.out.println("\n3. 测试 toString 方法:");
        System.out.println("   toString 结果：" + test.toString());
        
        // 测试 equals 和 hashCode
        System.out.println("\n4. 测试 equals 和 hashCode:");
        SimpleTest obj1 = new SimpleTest();
        obj1.setName("测试");
        obj1.setAge(20);
        
        SimpleTest obj2 = new SimpleTest();
        obj2.setName("测试");
        obj2.setAge(20);
        
        System.out.println("   obj1.hashCode(): " + obj1.hashCode());
        System.out.println("   obj2.hashCode(): " + obj2.hashCode());
        System.out.println("   obj1.equals(obj2): " + obj1.equals(obj2));
        
        System.out.println("\n=== 测试完成 ===");
    }
}
