import FreeSimpleGUI as sg
import archive

label1= sg.Text("Select the file to compress")
choose_button1 = sg.FilesBrowse("ChooseFile", key="filepath")
input1 = sg.Input()

label2 = sg.Text("Select the folder destination")
choose_button2 = sg.FolderBrowse("ChooseFolder", key="FolderPath")
input2 = sg.Input()

output_button = sg.Button("Compress")

complete = sg.Text("", key="output", text_color="green")

layout = [[label1, input1, choose_button1],
          [label2, input2, choose_button2],
          [output_button, complete]]
window = sg.Window("Archieve Files", layout=layout)

while True:
    event, value = window.read()
    filepaths = value["filepath"].split(";")
    folders = value["FolderPath"]
    archive.make_archive(filepaths, folders)
    window['output'].update(value="Comppression Completed")

window.close()
