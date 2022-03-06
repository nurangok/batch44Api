package base_url;

public class ReqresinBaseUrl {
    protected RequestSpecification spec01;

    @Before
    public void setUp(){
        spec01 = new RequestSpecBuilder().setBaseUri("https://reqres.in").build();
    }
}
