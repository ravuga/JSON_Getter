public class ReadJsonDataImpl implements ReadJsonService {

    @Override
    public String getData() {
        String response = Network.readJson("https://jsonplaceholder.typicode.com/todos/1");
        return response;
    }
}
