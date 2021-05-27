import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Todo App'),
        ),
        body: TodoApp(),
      ),
    );
  }
}

class TodoApp extends StatefulWidget {
  @override
  _TodoAppState createState() => _TodoAppState();
}

class _TodoAppState extends State<TodoApp> {
  TextEditingController newTask = new TextEditingController();
  List<String> task = [
    "Task 1",
    "Task 2",
    "Task 3",
  ];
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Column(
        children: [
          TextField(
            controller: newTask,
          ),
          TextButton(
              onPressed: () {
                setState(() {
                  task.add(newTask.text);
                });
              },
              child: Text('Add Task')),
          ListView.builder(
              shrinkWrap: true,
              itemCount: task.length,
              itemBuilder: (context, index) {
                return Text('\n${task[index]}');
              }),
        ],
      ),
    );
  }
}
