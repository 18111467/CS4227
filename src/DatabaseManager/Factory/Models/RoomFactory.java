package DatabaseManager.Factory.Models;

import DatabaseManager.Repository.DBConfig;
import DatabaseManager.Factory.IModel;
import DatabaseManager.Factory.ModelFactory;
import DatabaseManager.Repository.IRepository;
import DatabaseManager.Repository.RepositoryFactory;
import Models.RoomModel;

import java.sql.ResultSet;

public class RoomFactory extends ModelFactory implements IModel<RoomModel> {

    private IRepository repository;
    private ResultSet resultSet;
    private String query;

    @Override
    public void add(RoomModel item) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public RoomModel findById(int id) {
        return null;
    }

    @Override
    public RoomModel findByParameters(String... parameters) throws Exception {
        /*
        resultSet = null;
        repository = RepositoryFactory.getRepository(DBConfig.getDatabaseConfig());
        query = "SELECT user_name, password, first_name, last_name, email_address, loyalty_level FROM User " +
                "WHERE user_name = '" + parameters[0] + "' AND password = '" + parameters[1] + "';";
        try{
            resultSet = repository.queryDatabaseStatement(query);
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
        RoomModel room = new RoomModel();
        while (resultSet.next()){
            user.setUserName(parameters[0]);
            user.setPassword(parameters[1]);
            user.setFirstName(resultSet.getString("first_name"));
            user.setLastName(resultSet.getString("last_name"));
            user.setEmailAddress(resultSet.getString("email_address"));
            user.setLoyaltyLevel(Integer.valueOf(resultSet.getString("loyalty_level")));
        }
        return user;
        */
        return null;
    }
}

