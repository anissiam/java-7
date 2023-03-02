public class Strings {
    public static void main(String[] args) {
        int x = 50;
        String line = "Hello from java class ";
        String name = "Anis";
        String name1 = "Siam";
        /*String name2 = new String("Anis");
                            //By ref
        System.out.println(name == name1);
        System.out.println(name == name2);
                        //By value
        System.out.println(name.equals(name2));
*/
        System.out.println(name.concat(" " +name1)); //للدمج
        System.out.println(name.length()); //طول النص
        System.out.println(name.isEmpty()); //هل النص فارغ
        System.out.println(name.length()==0); //هل النص طوله صفر
        System.out.println(name.toLowerCase()); //حروف صغيرة
        System.out.println(name.toUpperCase()); //حروف كبيرة
        System.out.println(name.indexOf('s')); //البحث عن موقع الحرف
        System.out.println(name.indexOf('v')); //البحث عن موقع الحرف
        System.out.println(line.indexOf('a')); //البحث عن موقع الحرف
        System.out.println(line.lastIndexOf('a')); //البحث عن اخر موقع الحرف
        System.out.println(line.lastIndexOf('a')); //البحث عن اخر موقع الحرف
        System.out.println(name.equalsIgnoreCase("anis")); // البحث بغض النظر عن الحروف الكبيرة او الصغيرة
        System.out.println(line.substring(2));
        System.out.println(line.substring(2,8));
        System.out.println(line.charAt(0));// ترجع الحرف بناءا على الموقع
        System.out.println(line.contains("HI"));//البحث عن كلمة او حرف
        System.out.println(line.contains("java"));
        System.out.println(line.replace("java", "c++")); // تبديل كلمة بكلمة
        //line = line.trim(); لتخزين التعديل
        System.out.println(line.trim()); //تحذف المسافات من البداية او النهاية
        System.out.println(line.startsWith("He")); // هل يبدا النص ب He
        System.out.println(line.endsWith("java")); // هل ينتهي النص ب java








    }
}
