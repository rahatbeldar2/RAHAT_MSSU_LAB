import threading

sem = threading.Semaphore(1)
data = 0

def reader():
    with sem:
        print("Reader is reading:", data)

def writer():
    global data
    with sem:
        data += 1
        print("writer is writing :", data)

threads = [
    threading.Thread(target=reader),
    threading.Thread(target=reader),
    threading.Thread(target=writer),
    threading.Thread(target=writer)
]

for t in threads: t.start()
for t in threads: t.join()


# @rahatbeldar2 ➜ /workspaces/RAHAT_MSSU_LAB/OS_LAB (main) $ python lab2.py 
# Reader is reading: 0
# Reader is reading: 0
# writer is writing : 1
# writer is writing : 2
# @rahatbeldar2 ➜ /workspaces/RAHAT_MSSU_LAB/OS_LAB (main) $ 