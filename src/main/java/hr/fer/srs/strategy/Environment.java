package hr.fer.srs.strategy;

import hr.fer.srs.status.OperationStatus;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public interface Environment {
	
	String readLine() throws ShellIOException;
	
	void write(String text) throws ShellIOException;
	
	void writeln(String text) throws ShellIOException;
	
	SortedMap<String, ShellCommand> commands();

	void setMapInUse(String databaseName) throws ShellIOException;

	Map<String, String> getMapInUse();

	void setDatabaseNameinUse(String databaseName);

	String getDatabaseNameinUse();

	Character getPromptSymbol();

	String initDatabase(String name, String password) throws ShellIOException;

	OperationStatus destroyDatabase(String name) throws ShellIOException;

	OperationStatus putEntry(String databaseName, String password, String key, String value) throws ShellIOException;

	String getEntry(String databaseName, String password, String key) throws ShellIOException;

	OperationStatus deleteEntry(String databaseName, String password, String key) throws ShellIOException;

	String getAllEntries(String databaseName, String password) throws ShellIOException;

	List<String> listDatabases();

    List<String> readDatabaseAsList(String databaseName) throws ShellIOException;
}
