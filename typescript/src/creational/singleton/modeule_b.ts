import {MyDatabaseClassic} from './db/my-database-classic';
import './module_a';


const myDatabaseClassic = MyDatabaseClassic.getInstance();
myDatabaseClassic.add({ id: 1, name: 'Layon', age: 30 });
myDatabaseClassic.add({ id: 2, name: 'Amanda', age: 25 });
myDatabaseClassic.show();
