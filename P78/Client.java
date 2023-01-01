import library.Api;
class Client{
    public static void main(String[] args) {
        System.out.println(Api.member.hashCode());
        //System.out.println(((Object)Api.member).hashCode());

    }
}
/* 
The class Object and the method hashCode are
both public. The problem is that the hashCode method is invoked with a qualify-
ing type that is inaccessible to the client. The qualifying type of the method invo-
cation is library.Api.PackagePrivate, which is a nonpublic class in a different
package.
*/