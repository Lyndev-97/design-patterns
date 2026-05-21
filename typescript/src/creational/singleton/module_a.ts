import {MyDatabaseClassic} from './db/my-database-classic';


const myDatabaseClassic = MyDatabaseClassic.getInstance();
myDatabaseClassic.add({ id: 1, name: 'Alice', age: 30 });
myDatabaseClassic.add({ id: 2, name: 'Bob', age: 25 });
myDatabaseClassic.show();
