first_player = input()
second_player = input()
game = input()


def score(first, second):
    if first > second:
        return 'C'
    elif first < second:
        return 'E'
    else:
        return 'T'


def lucky_game():
    points_first_player = 0
    points_second_player = 0
    result = []

    for str in game:
        if str in first_player:
            points_first_player += 1
        if str in second_player:
            points_second_player += 1

        result.append(score(points_first_player, points_second_player))

    return result


print(''.join(map(str, lucky_game())))


"""
--- Input ---
AVM
MNM
RMRVMANNMMAVRVAMVMVAMRVVRRVVRV
--- Expected output (text)---
 TTTCCCCTTTCCCCCCCCCCCCCCCCCCCC

--- Input ---
VNVRR
VVVAR
NMVMMRMVRMVVRAVRRVRAAV
--- Expected output (text)---
 CCCCCCCCCCCCCTTTTTTEEE

--- Input ---
NMRVRA
NRMRVA
RNMVMVMMVMMRNMMRVAV
--- Expected output (text)---
 TTTTTTTTTTTTTTTTTTT

--- Input ---
MVM
RVM
VVRVMVVVMNVRARAVNVVR
--- Expected output (text)---
 TTEEEEEEEEEEEEEEEEEE

--- Input ---
VVRR
VVMV
VAMVVRMRMNAVVVVVMRVMVRNMVV

--- Expected output (text)---
 TTEEETETEEEEEEEEEEEEEEEEEE

--- Input ---
VMNVM
MAVRM
VVAMVRRVVMRMVVRVMRRVNARRMMR
--- Expected output (text)---
 TTEEEEEEEEEEEEEEEEEEEEEEEEE

--- Input ---
ARVMR
MRVNR
VNVMNRMRNANVVRARVVRNRNNMRV
--- Expected output (text)---
 TEEEEEEEEEEEEEEEEEEEEEEEEE

--- Input ---
AVVVR
MVRAN
RVVRAAANAVVVVAMVMRRARRRVVVN
--- Expected output (text)---
 TTTTTTTEEEEEEEEEEEEEEEEEEEE

--- Input ---
RMN
RNV
RMVVRMMARVAVRVVMNMMVNMMRVVRMV
--- Expected output (text)---
 TCTEETCCCTTEEEEEEETEETCCTEETE

--- Input ---
RMVRNM
NARMVR
MRMVNVMRMAMAMVRVVAVAVNNV
--- Expected output (text)---
 TTTTTTTTTEEEEEEEEEEEEEEE

--- Input ---
RRV
RMR
RVNAMVVRNRVAMRANVRRNMRRMMM
--- Expected output (text)---
 TCCCTCCCCCCCCCCCCCCCCCCCTE

--- Input ---
VVR
VRR
MRAVAVMMMVVVMMMRRV
--- Expected output (text)---
 TTTTTTTTTTTTTTTTTT

--- Input ---
RRAN
RVAV
MRVVAMMRVNVVVMRANVVANRAVVVVR
--- Expected output (text)---
 TTEEEEEEEEEEEEEEEEEEEEEEEEEE

--- Input ---
AMVN
VVNR
NNVNARRRNVNVMMVRAVMVMVNRVAV
--- Expected output (text)---
 TTTTCTEEEEEEETTETTCCCCCCCCC

--- Input ---
RMRVVA
MRMVRV
VMMVVRVVVNVMVVVRVVRMRMMAAV
--- Expected output (text)---
 TTTTTTTTTTTTTTTTTTTTTTTCCC

--- Input ---
RVAVV
VAMMV
NMAVRANAARVVRMMMRMAAAVRNMVAA
--- Expected output (text)---
 TEEETTTTTCCCCCTETEEEEETTEEEE

--- Input ---
MNARV
RRVAV
VRRAMVMANRVARRRVVRVAMRVNVVAV
--- Expected output (text)---
 TTTTCCCCCCCCCCCCCCCCCCCCCCCC

--- Input ---
MVNVAR
MVRNVM
NMRVVRVMMMMNAVARR
--- Expected output (text)---
 TTTTTTTTTTTTCCCCC

--- Input ---
MRVAV
RNRVV
MAMMVNNAVNRRVVVV
--- Expected output (text)---
 CCCCCCCCCCCCCCCC

--- Input ---
RAVMR
AVRMV
VMVRAVVRNARRVRA
--- Expected output (text)---
 TTTTTTTTTTTTTTT
"""
