import json


def shop():
    store = input()
    items = input()

    store = json.loads(store)
    items = items.split(' ')

    total = 0
    available_items = []
    for item in items:
        if item.lower() in store:
            total += store[item.lower()]
            available_items.append(item)

    print(total)
    print(' '.join(map(str, available_items)))


shop()
