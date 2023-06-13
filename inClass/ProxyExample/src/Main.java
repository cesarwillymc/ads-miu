import java.util.Objects;

public class Main implements Mediator {
    public static void main(String[] args) {
        var main = new Main();
        var viewModel = new LoginViewModel(main, new LoginUseCase(new LoginRepository(new ServiceImpl())));
        viewModel.signIn("will","12");
    }

    @Override
    public void updateUser(UserInfo info) {

    }

    @Override
    public void userError() {

    }
}

interface Mediator {
    void updateUser(UserInfo info);
    void userError();
}

class LoginViewModel {
    Mediator mediator;
    LoginUseCase useCase;

    public LoginViewModel(Mediator mediator, LoginUseCase useCase) {
        this.mediator = mediator;
        this.useCase = useCase;
    }

    public void signIn(String user, String password) {
        if (!validate(user, password))
            return;

        var data = useCase.execute(new LoginParams(user, password));
        if (data != null)
            mediator.updateUser(data);
        else mediator.userError();

    }

    private boolean validate(String user, String password) {
        if (user.isBlank())
            return false;
        return !password.isBlank();
    }

}

abstract class useCase<I, O> {
    abstract O execute(I data);
}

abstract class useCaseWithOutParams<I> {
    abstract I execute();
}

class LoginUseCase extends useCase<LoginParams, UserInfo> {
    private LoginDataSource loginDataSource;

    public LoginUseCase(LoginDataSource loginDataSource) {
        this.loginDataSource = loginDataSource;
    }

    @Override
    UserInfo execute(LoginParams data) {
        return loginDataSource.signIn(data.getName(), data.getPassword());
    }
}

interface LoginDataSource {
    UserInfo signIn(String user, String password);

    Boolean signOut();
}

class LoginRepository implements LoginDataSource {
    private Service service;

    public LoginRepository(Service service) {
        this.service = service;
    }

    @Override
    public UserInfo signIn(String user, String password) {
        return service.signIn(user, password);
    }

    @Override
    public Boolean signOut() {
        try {
            service.signOut();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}

class ServiceImpl implements Service {

    @Override
    public UserInfo signIn(String user, String password) {
        if (Objects.equals(user, "123") && Objects.equals(password, "12")) {
            return new UserInfo("Cesar", "Mamani");
        } else {
            return null;
        }
    }

    @Override
    public void signOut() {

    }
}

interface Service {
    UserInfo signIn(String user, String password);

    void signOut();
}

class UserInfo {
    String name;
    String lastName;

    public UserInfo(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}

class LoginParams {
    final String name;
    final String password;

    public LoginParams(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}