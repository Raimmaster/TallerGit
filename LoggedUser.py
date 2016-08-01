import os
 
class LoggedUser:

	def __init__(self, username):
		self.username = usernamgit e
		self.current_dir = 'Usuarios/' + username
		#crear carpeta personal si no existe
		if(not os.path.isdir(self.current_dir)):
				os.mkdir('Usuarios/' + username)
		self.prev_dir = self.current_dir
		self.logged = True

	def changeDirectory(self, new_dir): #cd
		own_dir = 'Usuarios/' + self.username
		print ('new dir: %s' % new_dir )
		if (new_dir == own_dir):
			print('Ya se encuentra en este directorio.')
		else:
			files_dirs = os.listdir(self.current_dir)
			el_dir = self.current_dir + '/' + new_dir
			if(new_dir in files_dirs and os.path.isdir(el_dir)):
				self.prev_dir = self.current_dir
				self.current_dir = self.prev_dir + "/" + new_dir

	def listFiles(self): #ls		
		f_names = []
		for file in os.listdir(self.current_dir):
			if(os.path.isdir(self.current_dir + '/' + file)):
				f_names.append('*: ' + file + "\n")
				print ("* %s " % file)
			else:		
				f_names.append(file + "\n")
				print ("- %s " % file)

		return ''.join(f_names) if len(f_names) > 0 else " " 

	def removeFile(self, filename): #remove file
		file_to_remove = self.current_dir + '/' + filename
		os.remove(file_to_remove)
		return

	def createDirectory(self, dirName): #mkdir
		dirFullPath = self.current_dir + "/" + dirName

		return False

	def getCurrentDirName(self): #pwd, optional
		return self.current_dir