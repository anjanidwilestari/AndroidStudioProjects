import 'package:uas_mobile/db_helper/database_connection.dart';
import 'package:sqflite/sqflite.dart';

class Repository
{
  late DatabaseConnection _databaseConnection;
  Repository(){
    _databaseConnection = DatabaseConnection();
  }
  static Database? _database;
  Future<Database?> get database async {
    if (_database != null) {
      return _database;
    } else {
      _database = await _databaseConnection.setDatabase();
      return _database;
    }
  }

  //Insert Student
  insertData(table, data) async {
    var connection = await database;
    return await connection?.insert(table, data);
  }
  //Read All Record
  readData(table) async {
    var connection = await database;
    return await connection?.query(table);
  }

  //Read a Single Record By ID
  readDataById(table, itemId) async {
    var connection = await database;
    return await connection?.query(table, where: 'id=?', whereArgs: [itemId]);
  }
  //Update Student
  updateData(table, data) async {
    var connection = await database;
    return await connection
        ?.update(table, data, where: 'id=?', whereArgs: [data['id']]);
  }

  //Delete Student
  deleteDataById(table, itemId) async {
    var connection = await database;
    return await connection?.rawDelete("delete from $table where id=$itemId");
  }

}