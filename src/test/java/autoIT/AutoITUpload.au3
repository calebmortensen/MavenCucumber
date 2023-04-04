$filepath = $CmdLine[1]

ControlFocus("Open", "", "Edit1")
ControlSetText("Open", "", "Edit1", $filepath)
ControlClick("Open", "", "Button1")